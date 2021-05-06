package com.tmg.util;

import com.tmg.model.auth.User;
import io.jsonwebtoken.Jws;
import org.springframework.util.StringUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

public class JwtUtils {
    // 主题
    public static final String SUBJECT = "cms";
    //秘钥
    public static final String APP_SECRET = "ukc8BDbRigUDaY6pZFfWus2jZWLPHO";    
    public static final long EXPIRE = 1000 * 60 * 30;  //过期时间，毫秒，30分钟

    public static String getJwtToken(String id, String username){

        String JwtToken = Jwts.builder()
                .setHeaderParam("typ", "JWT")
                .setHeaderParam("alg", "HS256")
                .setSubject("cms-user")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE))
                .claim("id", id)
                .claim("username", username)
                .signWith(SignatureAlgorithm.HS256, APP_SECRET)
                .compact();

        return JwtToken;
    }

    /**
     * 判断token是否存在与有效
     * @param jwtToken
     * @return
     */
    public static boolean checkToken(String jwtToken) {
        if(StringUtils.isEmpty(jwtToken)) return false;
        try {
            Jwts.parser().setSigningKey(APP_SECRET).parseClaimsJws(jwtToken);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 判断token是否存在与有效
     * @param request
     * @return
     */
    public static boolean checkToken(HttpServletRequest request) {
        try {
            String jwtToken = request.getHeader("CMS-Token");
            if(StringUtils.isEmpty(jwtToken)) return false;
            Jwts.parser().setSigningKey(APP_SECRET).parseClaimsJws(jwtToken);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 根据token获取会员id
     * @param request
     * @return
     */
    public static String getMemberIdByJwtToken(HttpServletRequest request) {
        String jwtToken = request.getHeader("CMS-Token");
        if(StringUtils.isEmpty(jwtToken)) return "";
        Jws<Claims> claimsJws = Jwts.parser().setSigningKey(APP_SECRET).parseClaimsJws(jwtToken);
        Claims claims = claimsJws.getBody();
        return claims.get("id").toString();
    }

    /**
     * 根据对象生成jwt的token字符串
     */
    public static String geneJsonWebToken(User user) {

        if (user == null || StringUtils.isEmpty(user.getId())
                || StringUtils.isEmpty(user.getPin())
                || StringUtils.isEmpty(user.getUsername())) {
            return null;
        }
        String token = Jwts.builder().setSubject(SUBJECT)
                .claim("id", user.getId())
                .claim("pin", user.getPin())
                .claim("username", user.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE))
                .signWith(SignatureAlgorithm.HS256, APP_SECRET).compact();
        return token;
    }

    /**
     * 校验jwt token
     */
    public static Claims checkJWT(String token) {
        Claims claims = Jwts.parser().setSigningKey(APP_SECRET).parseClaimsJws(token).getBody();
        return claims;
    }
    public static void main(String[] args) {
        User memberCenter = new User();
        memberCenter.setHeadUrl("xx");
        memberCenter.setUsername("zhangsan");
        memberCenter.setId(16);
        String token = JwtUtils.geneJsonWebToken(memberCenter);
        System.out.println(token);

        Claims claims = JwtUtils.checkJWT(token);
        System.out.println(claims.get("id"));
    }
}

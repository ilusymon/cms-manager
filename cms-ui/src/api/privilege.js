import request from '@/utils/request'

export function getPrivileges(searchName, type, siteId, currentPage, pageSize) {
  return request({
    url: '/privilege/list',
    method: 'get',
    params:{
      searchName, type, siteId, currentPage, pageSize
    }
  })
}

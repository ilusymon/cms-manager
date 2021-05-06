import request from '@/utils/request'

export function getPrivileges(params) {
  return request({
    url: '/privilege/list',
    method: 'get',
    params
  })
}

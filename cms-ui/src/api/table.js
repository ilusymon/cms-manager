import request from '@/utils/request'

export function getList(params) {
  return request({
    url: '/privilege/list',
    method: 'get',
    params
  })
}

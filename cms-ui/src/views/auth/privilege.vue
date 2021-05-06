<template>


  <div style="margin-top: 20px">

    <el-row :gutter="20">
      <el-col :span="5">
        <div class="grid-content bg-purple">
          <el-input
            placeholder="名称"
            v-model="searchName"
            clearable>
          </el-input>
        </div>
      </el-col>
      <el-col :span="3">
        <div class="grid-content bg-purple">
          <template>
            <el-select v-model="type" clearable placeholder="请选择类型">
              <el-option
                v-for="item in types"
                :key="item.value"
                :label="item.label"
                :value="item.value">
              </el-option>
            </el-select>
          </template>
        </div>
      </el-col>
      <el-col :span="3">
        <div class="grid-content bg-purple">
          <template>
            <el-select v-model="siteId" clearable placeholder="请选择站点">
              <el-option
                v-for="item in siteIds"
                :key="item.value"
                :label="item.label"
                :value="item.value">
              </el-option>
            </el-select>
          </template>
        </div>
      </el-col>
      <el-col :span="4">
        <div class="grid-content bg-purple">
          <el-button type="primary" icon="el-icon-search">搜索</el-button>
        </div>
      </el-col>
    </el-row>

    <div style="margin-top: 20px">

      <el-table
        ref="multipleTable"
        :data="tableData"
        tooltip-effect="dark"
        style="width: 100%"
        @selection-change="handleSelectionChange">
        <!--ID	名称	类型	分类	创建/更新者	创建/更新时间	操作-->
        <el-table-column
          type="selection"
          width="55">
        </el-table-column>
        <el-table-column
          label="ID"
          width="120">
          <template slot-scope="scope">{{ scope.row.id }}</template>
        </el-table-column>
        <el-table-column
          prop="name"
          label="名称"
          width="120">
        </el-table-column>
        <el-table-column
          prop="type"
          label="类型"
          width="120">
        </el-table-column>
        <el-table-column
          prop="categoryname"
          label="分类"
          width="120">
        </el-table-column>
        <el-table-column
          prop="creator"
          label="创建者"
          width="120">
        </el-table-column>
        <el-table-column
          prop="updator"
          label="更新者"
          width="120">
        </el-table-column>
        <el-table-column
          prop="createdTime"
          label="创建时间"
          width="120">
        </el-table-column>
        <el-table-column
          prop="updatedTime"
          label="更新时间"
          width="120">
        </el-table-column>
        <el-table-column label="操作">
          <template slot-scope="scope">
            <el-button v-if="true"
                       size="mini"
                       @click="handleEdit(scope.$index, scope.row)">查看
            </el-button>
            <el-button v-if="false"
                       size="mini"
                       @click="handleEdit(scope.$index, scope.row)">角色
            </el-button>
            <el-button v-if="true"
                       size="mini"
                       @click="handleEdit(scope.$index, scope.row)">人员
            </el-button>
            <el-button v-if="false"
                       size="mini"
                       type="danger"
                       @click="handleDelete(scope.$index, scope.row)">删除
            </el-button>
          </template>
        </el-table-column>
      </el-table>
    </div>

    <div>
      <el-button @click="opposite()">反选</el-button>
      <el-button @click="toggleSelection()">取消选择</el-button>
    </div>
    <div class="block">
      <el-pagination
        @size-change="handleSizeChange"
        @current-change="handleCurrentChange"
        :current-page="currentPage"
        :page-sizes="[20,50,100]"
        :page-size="pageSize"
        layout="total, sizes, prev, pager, next, jumper"
        :total="totalPage">
      </el-pagination>
    </div>
  </div>
</template>

<script>
  import {getPrivileges} from '@/api/privilege'

  export default {
    data() {
      return {
        tableData: [],
        multipleSelection: [],
        currentPage: 5,
        pageSize: 20,
        totalPage: 100,
        searchName: '',

        types: [{
          value: 1,
          label: '系统级权限'
        }, {
          value: 2,
          label: '站点级权限'
        }, {
          value: 3,
          label: '节点级权限'
        }],
        type: '',
        siteIds:[
          {
            value: 1,
            label: '系统级权限'
          }, {
            value: 2,
            label: '站点级权限'
          }, {
            value: 3,
            label: '节点级权限'
          }
        ],
        siteId:''
      }
    },
    created() {
      this.getPrivileges();
    },

    methods: {
      getPrivileges() {
        getPrivileges().then(resp => {
          console.log(resp);
          this.tableData = resp.data.records;
        })
      },
      toggleSelection(rows) {
        if (rows) {
          rows.forEach(row => {
            this.$refs.multipleTable.toggleRowSelection(row);
          });
        } else {
          this.$refs.multipleTable.clearSelection();
        }
      },
      handleSelectionChange(val) {
        this.multipleSelection = val;
      },
      handleEdit(index, row) {
        console.log(index, row);
      },
      handleDelete(index, row) {
        console.log(index, row);
      },
      opposite() {
        this.tableData.forEach((item) => {
          this.$refs.multipleTable.toggleRowSelection(item);
        });
      },
      handleSizeChange(val) {
        console.log(`每页 ${val} 条`);
      },
      handleCurrentChange(val) {
        console.log(`当前页: ${val}`);
      }
    }
  }
</script>

<template>
  <div>
    <el-button @click="dialogVisible = true">Staff Login</el-button>

    <el-dialog
      title="Login"
      :visible.sync="dialogVisible"
      width="30%"
      :before-close="handleClose">
      <el-form :inline="true"  class="demo-form-inline">
        <el-form-item label="Account">
          <el-input v-model="userName" clearable placeholder="Enter the User Name"></el-input>
        </el-form-item>
        <el-form-item label="Password">
          <el-input v-model="password" clearable placeholder="Enter your password"></el-input>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
      <el-button type="primary" @click="loadPost">Login</el-button>
      <el-button @click="dialogVisible = false">Cancel</el-button>
    </span>
    </el-dialog>
  </div>
</template>

<script>export default {
  name: "staffLoginDialog",
  data(){
    return {
      dialogVisible: false,
      yourName:"",
      total:0,
      userName:"",
      password:""
    };
  },
  methods:{
    loadPost() {
      this.$axios.post('http://localhost:8090/staffs/Staffs_Login',{
        param:{
          userName:this.userName,
          password:this.password
        }
      }).then(res=>res.data).then(res=>{
        console.log(res)
        if(res.code == 200){
          this.yourName = res.Name
          alert("登录成功！")
        }else{
          alert("账号或密码错误")
        }
      });
    },
    handleClose(done) {
      this.$confirm('确认关闭？')
        .then(_ => {
          done();
        })
        .catch(_ => {});
    }
  },
  beforeMount() {
    this.loadPost();
  }
}
</script>

<style scoped>

</style>

<template>
  <div id="app">
    <el-container>
      <el-header style="font-size: 12px">
        <span>Choose your way to login</span>
        <companyLoginDialog></companyLoginDialog>
        <staffLoginDialog></staffLoginDialog>
      </el-header>
    </el-container>
  </div>
</template>

<script>
import companyLoginDialog from "./components/companyLoginDialog";
import staffLoginDialog from "./components/staffLoginDialog";

export default {
  name: 'App',
  components:{
      staffLoginDialog,
      companyLoginDialog
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>

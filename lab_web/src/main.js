// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import axios from 'axios'

Vue.config.productionTip = false
Vue.prototype.$axios = axios;
Vue.prototype.$login = 0;
Vue.use(ElementUI);

new Vue({
  router,
  el: '#app',
  render: h => h(App)
});



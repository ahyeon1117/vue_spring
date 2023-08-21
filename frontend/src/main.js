import "./assets/reset.css";
import "./assets/main.css";

import { createApp } from "vue";
import App from "./App.vue";
import { router } from "./router/index.js";

const app = createApp(App);

app.use(router).mount("#app"); // 라우터 사용

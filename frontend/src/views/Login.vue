<template>
  <div class="loginBox">
    <div class="loginBox_sub">
      <div class="loginBox_logoArea">
        <h1 class="loginBox_logoArea_logo mgT20">logo</h1>
      </div>
      <div class="loginBox_inputArea">
        <div class="loginBox_inputArea_input-container">
          <label :class="idClass">전화번호, 사용자 이름 또는 이메일</label>
          <input v-model="data.input.id" class="mgT4" />
        </div>
        <div class="loginBox_inputArea_input-container">
          <label :class="pwClass">비밀번호</label>
          <input v-model="data.input.pw" class="mgT4" type="password" />
        </div>
        <button class="mgT12" type="">로그인</button>
      </div>
      <hr />
    </div>
  </div>
</template>
<script setup>
import { computed, reactive } from "vue";

const data = reactive({
  input: {
    id: "",
    pw: ""
  }
});
const idClass = computed(() => {
  console.log(
    data.input.id.length > 0
      ? "loginBox_inputArea_smallLabel"
      : "loginBox_inputArea_label"
  );
  return data.input.id.length > 0
    ? "loginBox_inputArea_smallLabel"
    : "loginBox_inputArea_label";
});
const pwClass = computed(() => {
  console.log(
    data.input.pw.length > 0
      ? "loginBox_inputArea_smallLabel"
      : "loginBox_inputArea_label"
  );
  return data.input.pw.length > 0
    ? "loginBox_inputArea_smallLabel"
    : "loginBox_inputArea_label";
});
</script>

function goToLogIn() {
  answer = confirm("로그인 먼저 하세요");
  if(answer == true){
    location.href = "http://127.0.0.1:5501/Web2/myweb/signForm.html";
  }
}

function BTNlogin() {
  const frm = document.forms["form"];

  const $id = $("#warn-id");
  const $pw = $("#warn-pw");
  const $wrapper = $("#login-group");

  // form validation
  if (frm["id"].value.trim() == "") {
      $pw.hide();
      $wrapper.animate({ height: "355px" }, 0);
      $id.show();
    return false;
  } else if (frm["pw"].value.trim() == "") {
      $id.hide();
      $wrapper.animate({ height: "355px" }, 0);
      $pw.show();
    return false;
  }
  
  alert(" 환영합니다");
  return true;
}
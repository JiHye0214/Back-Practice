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
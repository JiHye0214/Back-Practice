(function () {
  // 바다
  const $waterFront = $("#water-front");
  const $waterBack = $("#water-back");

  (function loopSea() {
    $waterFront
      .animate({ bottom: "-65px", left: "-30px" }, 500)
      .animate({ bottom: "-60px", left: "-25px" }, 500);
    $waterBack
      .animate({ bottom: "15px", left: "-20px" }, 500)
      .animate({ bottom: "10px", left: "-25px" }, 500);
    $.when($waterFront, $waterBack).then(loopSea);
    // $.when() : jQuery에서 when 함수 사용하겠다
  })();

  // 구름
  const $cloud1 = $("#cloud-group-1");
  const $cloud2 = $("#cloud-group-2");

  (function loopCloud() {
    $cloud1
      .animate({ left: "-720px" }, 10000, "linear")
      // 얘는 등속도운동을 하지 않는다 -> 느 빨 느
      // default --> swing
      // 등속도운동 --> linear
      .animate({ left: "0px" }, 0);
    $cloud2
      .animate({ left: "0px" }, 10000, "linear")
      .animate({ left: "720px" }, 0, loopCloud);

    // 동작 반복
    // 1. $.when()
    // 2. cloud2 마지막에 loopCloud 적어주기
  })();

  // 보트 & 타이틀 & 폼
  const $boat = $("#boat");
  const $questionMark = $("#question-mark");
  const $title1 = $("#title1");
  const $title2 = $("#title2");
  const $form = $("#form");

  // 초기값
  $questionMark.css({ opacity: 0 });
  $boat.css({ left: "-220px" });
  $title1.css({ opacity: 0 });
  $title2.css({ opacity: 0 });
  $form.css({ left: "370px" });

  // $boat.animate({'left' : '20px'}, 2000, function(){
  //     loopBoat(); // $boat 두둥실 ㅇㅈㄹ
  //     $questionMark.delay(500).animate({'opacity' : 1}, 1000, function(){ // $questionMark 등장
  //         $title1.animate({'opacity' : 1}, 1000, function(){ // $title1 등장
  //             $title2.animate({'opacity' : 1}, 1000, function(){ // $title2 등장
  //                 $form.animate({'left' : 0}, 500); // $form 등장
  //             }); // end $title2
  //         }); // end $title1
  //     }) // end $questionMark
  // }); // end $boat

  // ❗callback hell 발생
  // 단점 : 코드 가독성, 유지보수성 저하
  // 문제점 : title1, title 애니메이션 순서 바꾸려면?
  // questionMark 애니메이션 삭제하려면?

  // 방법1 : .when() .then() 사용
  // when()은 promise 객체 리턴!

//   $.when($boat.animate({ left: "20px" }, 2000))
//     .then(function () {
//       loopBoat(); // 두둥실
//       // when은 promise 객체 리턴
//       return $.when($questionMark.delay(500).animate({ opacity: 1 }, 1000));
//     })
//     // 리턴하면 바로 다음에 함수 작성 가능 
//     .then(function () {
//       return $.when($title1.animate({ opacity: 1 }, 1000));
//     })
//     .then(function () {
//       return $.when($title2.animate({ opacity: 1 }, 1000));
//     })
//     .then(function () {
//       $form.animate({ left: 0 }, 500);
//     });

  // 방법2 : '단일 object' 애니메이션의 경우 promise() 만으로 가능
  // 즉, $.when() 안 써도 됨

  $boat.animate({ left: "20px" }, 2000).promise()
    .then(function () {
      loopBoat(); // 두둥실
      // when은 promise 객체 리턴
      return $questionMark.delay(500).animate({ opacity: 1 }, 1000).promise();
    })
    // 리턴하면 바로 다음에 함수 작성 가능 
    .then(function () {
      return $title1.animate({ opacity: 1 }, 1000).promise();
    })
    .then(function () {
      return $title2.animate({ opacity: 1 }, 1000).promise();
    })
    .then(function () {
      $form.animate({ left: 0 }, 500);
    });

  function loopBoat() {
    $boat
      .animate({ bottom: "15px" }, 500)
      .animate({ bottom: "25px" }, 500, loopBoat);
  }
})();

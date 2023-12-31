
// heather api
var api_key = "43736f5a4764646437384a78594475";
 
$(document).ready(function(){
	$("#btn_load").click(function(){
		var area = document.getElementById("area").value.trim();
		 var url;
		 url = `http://openapi.seoul.go.kr:8088/${api_key}/xml/citydata/1/5/${area}`;
		
		$.ajax({
			url: url,
			type: "GET",
			cache: false,
			success: function(data, status){
				(status == "success") && parseXML(data);
			},
		});
	});
 });
 
 function parseXML(xmlDOM) {
  var i;

  var table = "<tr><th>장소</th><th>시간</th><th>기온</th><th>최고기온</th><th>최저기온</th><th>강수확률</th></tr>";
  var x = xmlDOM.getElementsByTagName("WEATHER_STTS");
  for (i = 0; i < x.length-1; i++) {
    table += "<tr>";
    table += "<td>" + xmlDOM.getElementsByTagName("AREA_NM")[0].childNodes[0].nodeValue + "</td>";
    table += "<td>" + x[i].getElementsByTagName("WEATHER_TIME")[0].childNodes[0].nodeValue + "</td>";
    table += "<td>" + x[i].getElementsByTagName("TEMP")[0].childNodes[0].nodeValue + "</td>";
    table += "<td>" + x[i].getElementsByTagName("MAX_TEMP")[0].childNodes[0].nodeValue + "</td>";
    table += "<td>" + x[i].getElementsByTagName("MIN_TEMP")[0].childNodes[0].nodeValue + "</td>";		
    table += "<td>" + x[i].getElementsByTagName("RAIN_CHANCE")[0].childNodes[0].nodeValue + "</td>";		
    table += "</tr>";
  }
  document.getElementById("demoXML").innerHTML = table;
}


// picture carousel
let slideBannerIndex = 0;
const $slideBanner = document.querySelector("#slide-banner > ul");
const $slideBannerItem = document.querySelectorAll("#slide-banner > ul > li");
const $slideBannerPrevBtn = document.querySelector(".slide-prev-btn");
const $slideBannerNextBtn = document.querySelector(".slide-next-btn");
const slideBannerWidth = $slideBanner.clientWidth;

const prevSlideBanner = () => {
  if (slideBannerIndex <= 0) {
    slideBannerIndex = $slideBannerItem.length - 1;
  } else {
    slideBannerIndex--;
  }
  console.log(slideBannerWidth * slideBannerIndex);
  $slideBanner.style.transform = `translateX(-${slideBannerWidth * slideBannerIndex}px)`;
};

const nextSlideBanner = () => {
  if (slideBannerIndex >= $slideBannerItem.length - 1) {
    slideBannerIndex = 0;
  } else {
    slideBannerIndex++;
  }
  console.log(slideBannerWidth * slideBannerIndex);
  $slideBanner.style.transform = `translateX(-${slideBannerWidth * slideBannerIndex}px)`;
};

$slideBannerPrevBtn.addEventListener("click", prevSlideBanner);
$slideBannerNextBtn.addEventListener("click", nextSlideBanner);
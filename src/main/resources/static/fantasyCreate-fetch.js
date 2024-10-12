/**
 * 
 */
const movieFrom = document.getElementById("movieFrom");

movieFrom.addEventListener("submit",function(e){
	e.preventDefault();
	
	const movie = {
		"movieName":document.getElementById("movieName").value,
		"productionYear": document.getElementById("productionYear").value,
		"description":document.getElementById("descrption").value,
	}
	fetch("/fantasy/create", {
		method:{
			"Content-Type": "application/json",
		},
		body:JSON.stringify(movie),
	})
	.then(response => {
		if (response.ok) {
			console.log(movie);
			alert("데이터 추가 성공");
			movieFrom.reset();
		}else{
			alert("데이터 추가 실패");
		}
	})
	.catch(error => {
		console.error ("error:",error);
		alert("에러 발생");
	})
});
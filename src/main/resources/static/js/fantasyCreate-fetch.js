/**
 * 
 */
const movieForm = document.getElementById("movieForm");

movieForm.addEventListener("submit",function(e){
	e.preventDefault();
	
	const movie = {
		"movieName":document.getElementById("movieName").value,
		"productionYear": document.getElementById("productionYear").value,
		"description":document.getElementById("description").value,
	}
	fetch("/fantasy/create", {
		method: "POST",
		headers: {
			"Content-Type": "application/json",
		},
		body:JSON.stringify(movie),
	})
	.then(response => {
		if (response.ok) {
			alert("데이터 추가 성공");
			movieForm.reset();
		}else{
			alert("데이터 추가 실패");
		}
	})
	.catch(error => {
		console.error ("error:",error);
		alert("에러 발생");
	})
});
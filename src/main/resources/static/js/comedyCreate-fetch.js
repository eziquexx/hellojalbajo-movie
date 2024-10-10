/**
 * 
 */


const movieFrom = document.getElementById("movieFrom");

movieFrom.addEventListener("submit", function(e) {
	e.preventDefault(); //이벤트 방지
	
	const movie = {
		"movieName": document.getElementById("movieName").value,
		"production_year": document.getElementById("productionYear").value,
		"description": document.getElementById("description").value,
	}
	fetch("/comedy/create", {
		method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(movie),
	})
	.then(response => {
		if (response.ok) {
			console.log(movie); // 확인용 로그
			alert("데이터 추가 성공");
			movieFrom.reset();
		} else {
			alert("데이터 추가 실패");
		}
	})
	.catch(error => {
		console.error("error: ", error);
		alert("에러 발생");
	})
});
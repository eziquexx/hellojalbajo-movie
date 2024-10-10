/**
 *
 */

const createForm = document.getElementById("createForm");
createForm.addEventListener("submit", function(e) {
    e.preventDefault();

    const movieInfo = {
        movieName: document.getElementById("info_name").value,
        productionYear: document.getElementById("info_year").value,
        description: document.getElementById("info_des").value,

    }

    fetch("/documentary/create", {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(movieInfo)
    })
        .then(response => {
            if (response.ok) {
                alert("영화 데이터 추가 성공");
                createForm.reset();
            } else {
                alert("실패");
                console.log(movieInfo);
            }
        })
        .catch(error => {
            console.error("Error: ", error);
            alert("오류 발생");
        })
});
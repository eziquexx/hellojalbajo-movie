document.getElementById('musicalForm').addEventListener('submit', function(e) {
    e.preventDefault();
    
    const musical = {
        movieName: document.getElementById('musical_name').value,
		production_year: document.getElementById('musical_proct').value,
    	description: document.getElementById('musical_descript').value
		
		};

    fetch('/musical', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(musical)
    })
    .then(response => {
        if (response.ok) {
            alert('뮤지컬 정보가 성공적으로 생성되었습니다.');
            document.getElementById('musicalForm').reset();
        } else {
            alert('뮤지컬 정보 생성에 실패했습니다.');
        }
    })
    .catch(error => {
        console.error('Error:', error);
        alert('오류가 발생했습니다.');
    });
});
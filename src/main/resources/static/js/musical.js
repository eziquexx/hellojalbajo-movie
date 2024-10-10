document.getElementById('musicalForm').addEventListener('submit', function(e) {
    e.preventDefault();
    
    const musical = {
        moviename: document.getElementById('musical_name').value,
		production_year: document.getElementById('musical_proct').value
    	DESCRIPTION: document.getElementById('musical_descript').value
		
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
            alert('메시지가 성공적으로 생성되었습니다.');
            document.getElementById('musicalForm').reset();
        } else {
            alert('메시지 생성에 실패했습니다.');
        }
    })
    .catch(error => {
        console.error('Error:', error);
        alert('오류가 발생했습니다.');
    });
});
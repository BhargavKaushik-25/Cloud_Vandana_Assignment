
let reversedSentence='';

function reverseWord(word) {
    let reversed = '';
    for (let i = word.length - 1; i >= 0; i--) {
        reversed += word[i];
    }
    return reversed;
}


function revSen()
{
    let input  = document.getElementById('sent');
    
    const words = input.value.split(' ');
    
    for (let i = 0; i < words.length; i++) {
        reversedSentence += reverseWord(words[i]);
        
        if (i < words.length - 1) {
            reversedSentence += ' ';
        }   
    }
    input.value = reversedSentence;
}




let a = new Array(5,32,53,2,6);
document.body.innerHTML+=`<h3>array before sorting is:- ${a}</h3>`
console.log("before sorting")
console.log(a)

for(let i = 0;i<a.length;i++)
{
    for(let j = i+1;j<a.length;j++)
    {
        if(a[i]<a[j])
        {
            let temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
console.log("after sorting in descending order")
console.log(a);
document.body.innerHTML +=`<h3>after sorting in descending order:--  ${a}</h3>`

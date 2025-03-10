function test(){
  const ul_tag = document.querySelector('.my-ul');
  let date ='';

  for(let i = 0 ; i < 1000 ; i++){
    //ul_tag.innerHTML = ul_tag.innerHTML + `<li>${i}</li>`;
    data = data + `<li>${i}</li>`;
  }
  ul_tag.innerHTML = data;
  
}
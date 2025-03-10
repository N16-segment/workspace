const arr1 = [1, 2, 3];
const arr2 = [4, 5];

const arr3 = [1,2,3, ...arr2];//...이 spread 연산자이다.


//[1,2,3,4,5]
// arr1[3] = 5;//[1,2,3,5] 배열의 3번째에 값을 추가하는 것
// arr1.push(6);//[1,2,3,5,6] 배열의 마지막에 데이터를 넣는 것
arr1[3] = arr2;//[1,2,3,[4,5]]
// arr1.push(arr2);
console.log(arr1);

const person = {
  name : 'kim',
  age : 20
};

const score = {
  korScore : 80,
  mathScore : 100
};

const student = {
  ...person,
  ...score
};

const student1 = {
  person,
  score
};//{}를 포함한 내용이 들어온다. 
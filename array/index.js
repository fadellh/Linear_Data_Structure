// let array = [3, 5, -4, 8, 11, 1, -1, 6];
// let targetsum = 10;

// let twoNumberSum = (array, targetsum) => {
//   let result = [];

//   for (i in array) {
//     let sum = array[i];
//     console.log(array[2]);
//   }
//   console.log(result);
// };

// console.log(twoNumberSum(array, targetsum));

var competitions = [
  ["HTML", "C#"],
  ["C#", "Phyton"],
  ["Phyton", "HTML"],
];

var results = [0, 0, 1];

function tournamentWinner(competitions, results) {
  // Write your code here.
  var obj = {};

  for (var i = 0; i < competitions.length; i++) {
    var winner = checkCompt(competitions[i], results[i]);
  }
  console.log(obj);
  return obj;
}

function checkCompt(currentComp, currentResult) {
  if (currentResult == 0) {
    return currentComp[1];
  }
  return currentComp[0];
}

console.log(tournamentWinner(competitions, results));

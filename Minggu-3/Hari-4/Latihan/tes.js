var a = 5;
function check(n) {
console.log('----------');
if (n > 0) {
console.log(n + ' lebih besar dari 0');
} else {
console.log(n + ' tidak lebih besar dari 0');
}
if (n > a) {
console.log(n
} else if (n < a)
console.log(n
} else {
console.log(n
}
+ ' lebih besar dari ' + a);
{
+ ' kurang dari ' + a);
+ ' sama dengan ' + a);
}
check(1);
check(10);
check(-1);
check(5);
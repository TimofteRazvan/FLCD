int a;
int b;
read a;
read b;
while (a != b) {
    if (a > b) {
        a = a - b;
    } else {
        b = b - a;
    }
}
write a;
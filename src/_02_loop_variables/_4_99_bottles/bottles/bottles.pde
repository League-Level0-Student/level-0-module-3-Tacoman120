for(int i = 99; i > -1; i--){
print(" "+i+" bottles of beans on the wall "+i+" bottles of beans! Take one down, pass it around "+(i-1)+" bottles of beans on the wall!");
if(i == 0){
 print("No bottles of beans on the wall! No bottles of beans! Go to the beanery and buy some more "+(i+=99)+" bottles of beans on the wall! ");
}
}

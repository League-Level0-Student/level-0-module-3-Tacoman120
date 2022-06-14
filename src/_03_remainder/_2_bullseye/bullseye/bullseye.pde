
void setup() {
 
  // set the size of your sketch
  size(1000, 1000);

}
 
void draw() {
  \
      int s = 1000;
  int w = 1000;
  int with = 900;
  int hight = 900;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int e = 0; e < 10; e++){
    if (e % 2 == 0){
      fill(300, 0, 0);
      ellipse(500, 500, s, w);
    }else{
      fill(0, 0, 0);
      ellipse(500, 500, with, hight);
    }
 s-=200;
w -= 200;
with -= 200;
hight -= 200;
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}

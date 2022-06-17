
void setup() {
 
  // set the size of your sketch
  size(1000, 1000);

}
 
void draw() {
  
 
  int with = 900;
  int hight = 900;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int e = 0; e < 40; e++){
      fill(300, 0, 0);
    if(e % 2 == 1){
      fill(0, 0, 0);
    }
          ellipse(500, 500, with, hight);

with -= 25;
hight -= 25;
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}

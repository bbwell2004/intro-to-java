PImage CatPic;
int x=160;
int y=471;
int a=349;
int b=434;
int acc=5;
void setup(){
  size(750,940);
  CatPic=loadImage("cat.jpg");
  CatPic.resize(750,940); 
background(CatPic);

}
  void draw(){   
    fill(255, 0, 0);
      ellipse(160, 471, 10, 100);
       ellipse(349, 434, 10, 100);
       noStroke()
  }
  
 void keyPressed() {
  x-=2*acc;
  y-=2*acc;
  a-=2*acc;
  b-=2*acc;
 }


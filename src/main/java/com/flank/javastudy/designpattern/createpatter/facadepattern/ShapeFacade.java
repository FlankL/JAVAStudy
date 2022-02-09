package com.flank.javastudy.designpattern.createpatter.facadepattern;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class ShapeFacade {
    private Circle circle;
    private Rectangle rectangle;

    public ShapeFacade(){
        circle=new Circle();
        rectangle=new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}

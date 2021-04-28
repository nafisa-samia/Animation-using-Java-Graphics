/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojectanimation;

/**
 *
 * @author Samia
 */
import java.awt.*;
import javax.swing.*;

public class MiniprojectAnimation extends JPanel {

    int x = 0, y = 0, z = 0;
    int s = 0, r = 0;

    private void moveCloud_Car() {
        x += 1;
        y += 1;
        z += 1;
        s += 8; //car
        r += 1;

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(new Color(0, p, p));
        g.fillRect(0, 0, 1340, 700);

        //sun
        g.setColor(Color.yellow);
        g.fillArc(100 + x, 20 + x, 80, 80, 0, 360);
        g.drawLine(95 + x, 55 + x, 75 + x, 55 + x);
        g.drawLine(140 + x, 105 + x, 140 + x, 125 + x);
        g.drawLine(140 + x, 15 + x, 140 + x, 0 + x);
        g.drawLine(185 + x, 60 + x, 205 + x, 60 + x);
        g.drawLine(105 + x, 35 + x, 85 + x, 25 + x);
        g.drawLine(120 + x, 20 + x, 105 + x, 5 + x);
        g.drawLine(100 + x, 80 + x, 80 + x, 90 + x);
        g.drawLine(115 + x, 100 + x, 100 + x, 120 + x);
        g.drawLine(175 + x, 5 + x, 160 + x, 20 + x);
        g.drawLine(205 + x, 25 + x, 175 + x, 35 + x);
        g.drawLine(205 + x, 90 + x, 175 + x, 80 + x);
        g.drawLine(175 + x, 120 + x, 160 + x, 100 + x);

        //moon
        g.setColor(new Color(255, 255, 255));
        g.fillOval(mx, my, 65, 65);

        //hiding sun
        g.setColor(new Color(0, p, p));
        g.fillRect(102, 327, 700, 700);

        //Star
        g.setColor(new Color(t, 255, 255));
        g.fillOval(90, 30, 2, 2);
        g.fillOval(30, 200, 2, 2);
        g.fillOval(200, 50, 2, 2);
        g.fillOval(300, 120, 2, 2);
        g.fillOval(500, 20, 2, 2);
        g.fillOval(100, 150, 2, 2);
        g.fillOval(400, 180, 2, 2);
        g.fillOval(600, 200, 2, 2);
        g.fillOval(150, 20, 2, 2);
        g.fillOval(550, 80, 2, 2);
        g.fillOval(650, 160, 2, 2);
        g.fillOval(590, 50, 2, 2);
        g.fillOval(400, 120, 2, 2);
        g.fillOval(350, 20, 2, 2);

        //Cloud
        g.setColor(new Color(q, q, q));

        g.fillArc(60 + z, 130, 80, 50, 0, 360);
        g.fillArc(90 + z, 120, 70, 50, 0, 360);
        g.fillArc(130 + z, 130, 80, 50, 0, 360);

        g.fillArc(210 - x, 50, 80, 50, 0, 360);
        g.fillArc(240 - x, 30, 70, 50, 0, 360);
        g.fillArc(260 - x, 40, 80, 50, 0, 360);

        g.fillArc(320 - z, 100, 80, 50, 0, 360);
        g.fillArc(340 - z, 90, 70, 50, 0, 360);
        g.fillArc(360 - z, 100, 80, 50, 0, 360);

        g.fillArc(400 + x, 50, 80, 50, 0, 360);
        g.fillArc(420 + x, 40, 70, 50, 0, 360);
        g.fillArc(440 + x, 50, 80, 50, 0, 360);

        //Road//
        g.setColor(Color.BLACK);
        g.fillRect(0, 500, 710, 10);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 510, 710, 500);
        g.setColor(Color.white);
        g.fillRect(0, 600, 200, 5);
        g.fillRect(400, 600, 200, 5);

        //car
        g.setColor(Color.YELLOW);
        g.fillRect(50 + s, 600, 200, 40);
        g.setColor(Color.MAGENTA);
        g.fillRect(80 + s, 550, 120, 50);
        g.setColor(Color.black);
        g.fillOval(80 + s, 620, 40, 40);
        g.fillOval(170 + s, 620, 40, 40);
        g.setColor(Color.white);
        g.fillOval(90 + s, 630, 20, 20);
        g.fillOval(180 + s, 630, 20, 20);

        //car 2
        g.setColor(Color.red);
        g.fillArc(675 - s, 515, 140, 60, 0, 180);
        g.fillArc(705 - s, 500, 80, 60, 0, 180);

        g.setColor(Color.white);
        g.fillArc(720 - s, 504, 52, 37, 0, 90);
        g.fillArc(713 - s, 504, 55, 36, 90, 90);
        g.fillArc(685 - s, 527, 7, 7, 0, 360);
        g.fillArc(797 - s, 527, 7, 7, 0, 360);

        g.setColor(Color.black);
        g.fillArc(700 - s, 530, 20, 20, 0, 360);
        g.fillArc(760 - s, 530, 20, 20, 0, 360);
        g.setColor(Color.white);
        g.fillArc(704 - s, 534, 12, 12, 0, 360);
        g.fillArc(764 - s, 534, 12, 12, 0, 360);

//        //car 3
//        g.setColor(Color.green);
//        g.fillArc(0 + s, 615, 140, 60, 0, 180);
//        g.fillArc(30 + s, 600, 80, 60, 0, 180);
//
//        g.setColor(Color.white);
//        g.fillArc(45 + s, 604, 52, 37, 0, 90);
//        g.fillArc(38 + s, 604, 55, 36, 90, 90);
//        g.fillArc(10 + s, 627, 7, 7, 0, 360);
//        g.fillArc(122 + s, 627, 7, 7, 0, 360);
//
//        g.setColor(Color.black);
//        g.fillArc(25 + s, 630, 20, 20, 0, 360);
//        g.fillArc(85 + s, 630, 20, 20, 0, 360);
//        g.setColor(Color.white);
//        g.fillArc(29 + s, 634, 12, 12, 0, 360);
//        g.fillArc(89 + s, 634, 12, 12, 0, 360);
        //home-1 bg
        g.setColor(new Color(159, 165, 197));
        g.fillRect(102, 327, 516, 92);

        //roof-5 back
        g.setColor(new Color(27, 39, 91));
        int a5[] = {435, 488, 492, 432};
        int b5[] = {191, 191, 211, 211};
        g.fillPolygon(a5, b5, 4);

        //roof-1
        g.setColor(new Color(27, 39, 91));
        int a[] = {88, 142, 590, 640};
        int b[] = {322, 210, 210, 322};
        g.fillPolygon(a, b, 4);

        g.setColor(Color.white);
        g.fillRect(88, 322, 552, 5);

        //roof-6 front
        g.setColor(new Color(41, 53, 114));
        int a6[] = {204, 214, 444, 450};
        int b6[] = {318, 287, 287, 318};
        g.fillPolygon(a6, b6, 4);

        g.setColor(Color.white);
        g.fillRect(204, 318, 246, 5);

        //roof-2
        g.setColor(new Color(16, 19, 70));
        int c[] = {216, 238, 436, 448};
        int d[] = {225, 165, 165, 225};
        g.fillPolygon(c, d, 4);

        g.setColor(new Color(166, 169, 204));
        int m[] = {240, 424, 430, 228};
        int n[] = {210, 210, 224, 224};
        g.fillPolygon(m, n, 4);

        //roof up
        g.setColor(Color.black);
        g.fillRect(365, 154, 4, 15);
        g.fillOval(364, 153, 6, 6);
        g.fillOval(364, 150, 6, 6);

        //home-2 body
        g.setColor(new Color(145, 157, 199));
        g.fillRect(226, 224, 210, 64);

        g.setColor(new Color(132, 138, 168));

        g.drawLine(231, 224, 330, 224);
        g.drawLine(231, 232, 330, 232);
        g.drawLine(231, 240, 330, 240);
        g.drawLine(231, 248, 330, 248);
        g.drawLine(231, 256, 330, 256);
        g.drawLine(231, 264, 330, 264);
        g.drawLine(231, 272, 330, 272);
        g.drawLine(231, 280, 330, 280);

        g.setColor(new Color(192, 198, 236));
        int e[] = {212, 205, 330, 454, 446, 330};
        int f[] = {235, 230, 135, 230, 235, 148};
        g.fillPolygon(e, f, 6);

        g.setColor(Color.black);
        int h[] = {212, 205, 330, 454, 446, 330};
        int i[] = {235, 230, 135, 230, 235, 148};
        g.drawPolygon(h, i, 6);

        g.setColor(new Color(38, 50, 90));
        int j[] = {248, 330, 412};
        int k[] = {210, 148, 210};
        g.fillPolygon(j, k, 3);

        g.setColor(new Color(164, 177, 219));
        g.fillRect(318, 160, 26, 34);

        g.setColor(new Color(132, 145, 187));
        g.fillRect(324, 166, 14, 23);

        g.setColor(new Color(131, 145, 180));
        g.drawLine(317, 191, 344, 191);

        //window-2
        g.setColor(new Color(198, 218, 227));
        g.fillRect(246, 232, 57, 49);

        g.setColor(new Color(240, 179, 64));
        g.fillRect(250, 236, 49, 40);

        g.setColor(new Color(191, 146, 70));
        g.drawLine(250, 237, 275, 237);
        g.drawLine(250, 250, 275, 250);
        g.drawLine(250, 263, 275, 263);

        g.drawLine(263, 237, 263, 275);

        g.setColor(new Color(253, 222, 176));
        g.fillRect(275, 236, 24, 40);

        //home-3 body
        g.setColor(new Color(172, 186, 221));
        g.fillRect(325, 224, 112, 72);

        g.setColor(new Color(147, 154, 187));

        g.drawLine(330, 224, 430, 224);
        g.drawLine(330, 232, 430, 232);
        g.drawLine(330, 240, 430, 240);
        g.drawLine(330, 248, 430, 248);
        g.drawLine(330, 256, 430, 256);
        g.drawLine(330, 264, 430, 264);
        g.drawLine(330, 272, 430, 272);
        g.drawLine(330, 280, 430, 280);
        g.drawLine(330, 288, 430, 288);

        //roof-3
        g.setColor(new Color(192, 198, 236));
        int p[] = {314, 308, 379, 454, 446, 379};
        int q[] = {235, 230, 172, 230, 235, 184};
        g.fillPolygon(p, q, 6);

        g.setColor(Color.black);
        int r[] = {314, 308, 379, 454, 446, 379};
        int s[] = {235, 230, 172, 230, 235, 184};
        g.drawPolygon(r, s, 6);

        //window-3
        g.setColor(new Color(198, 218, 227));
        g.fillRect(354, 236, 57, 51);

        g.setColor(new Color(252, 193, 15));
        g.fillRect(358, 240, 49, 43);

        g.setColor(new Color(191, 146, 70));
        g.drawLine(359, 241, 381, 241);
        g.drawLine(359, 256, 381, 256);
        g.drawLine(359, 272, 381, 272);

        g.drawLine(369, 241, 369, 282);

        g.setColor(new Color(253, 222, 176));
        g.fillRect(382, 240, 25, 43);

        //roof-4
        g.setColor(new Color(74, 77, 122));
        int c4[] = {515, 565, 615};
        int d4[] = {300, 264, 300};
        g.fillPolygon(c4, d4, 3);

        g.setColor(new Color(166, 169, 204));
        int m4[] = {500, 516, 619, 635};
        int n4[] = {314, 300, 300, 314};
        g.fillPolygon(m4, n4, 4);

        g.setColor(new Color(172, 182, 218));
        g.fillRect(500, 314, 130, 15);

        //home-4 body
        //g.setColor(new Color(191, 178, 198));
        g.setColor(new Color(172, 186, 221));
        g.setColor(new Color(205, 184, 201));
        g.fillRect(500, 329, 130, 95);

        g.setColor(new Color(164, 166, 172));
        g.drawLine(511, 335, 611, 335);
        g.drawLine(511, 343, 611, 343);
        g.drawLine(511, 351, 611, 351);
        g.drawLine(511, 359, 611, 359);
        g.drawLine(511, 367, 611, 367);
        g.drawLine(511, 375, 611, 375);
        g.drawLine(511, 383, 611, 383);
        g.drawLine(511, 391, 611, 391);
        g.drawLine(511, 399, 611, 399);
        g.drawLine(511, 407, 611, 407);
        g.drawLine(511, 415, 611, 415);

        g.setColor(Color.white);
        g.fillRect(500, 329, 17, 60);

        g.setColor(new Color(128, 110, 126));
        g.fillRect(500, 389, 17, 35);

        g.setColor(new Color(38, 50, 90));
        int j4[] = {514, 564, 615};
        int k4[] = {300, 265, 300};
        g.fillPolygon(j4, k4, 3);

        g.setColor(new Color(164, 177, 219));
        g.fillRect(550, 265, 25, 30);

        g.setColor(new Color(132, 145, 187));
        g.fillRect(556, 272, 14, 16);

        g.setColor(new Color(131, 145, 180));
        g.drawLine(550, 290, 575, 290);

        g.setColor(new Color(192, 198, 236));
        int e4[] = {487, 480, 563, 647, 640, 563};
        int f4[] = {325, 317, 253, 317, 325, 265};
        g.fillPolygon(e4, f4, 6);

        g.setColor(Color.black);
        int h4[] = {487, 480, 563, 647, 640, 563};
        int i4[] = {325, 317, 253, 317, 325, 265};
        g.drawPolygon(h4, i4, 6);

        //window-4
        g.setColor(new Color(198, 218, 227));
        g.fillRect(533, 329, 68, 60);

        g.setColor(new Color(240, 179, 64));
        g.fillRect(538, 334, 58, 49);

        g.setColor(new Color(191, 146, 70));
        g.drawLine(538, 334, 570, 334);
        g.drawLine(538, 347, 570, 347);
        g.drawLine(538, 364, 570, 364);
        g.drawLine(538, 377, 570, 377);

        g.drawLine(552, 334, 552, 382);

        g.setColor(new Color(253, 222, 176));
        g.fillRect(564, 334, 33, 49);

        //door
        g.setColor(new Color(255, 187, 110));
        g.fillRect(438, 327, 60, 90);

        g.setColor(new Color(14, 46, 85));
        g.fillRect(438, 342, 32, 70);

        g.setColor(Color.black);
        g.drawRect(438, 342, 32, 70);

        g.setColor(new Color(255, 187, 110));
        g.fillRect(443, 348, 10, 7);

        g.setColor(new Color(255, 187, 110));
        g.fillRect(453, 348, 10, 7);

        g.setColor(new Color(255, 187, 110));
        g.fillRect(443, 355, 10, 7);

        g.setColor(new Color(255, 187, 110));
        g.fillRect(453, 355, 10, 7);

        g.setColor(new Color(71, 69, 64));
        g.drawRect(443, 348, 10, 7);
        g.drawRect(453, 348, 10, 7);
        g.drawRect(443, 355, 10, 7);
        g.drawRect(453, 355, 10, 7);

        g.setColor(new Color(10, 33, 61));
        g.drawRect(443, 367, 8, 35);

        g.setColor(new Color(10, 33, 61));
        g.drawRect(454, 367, 8, 35);

        g.setColor(new Color(225, 181, 205));
        g.fillOval(465, 379, 5, 5);

        //window beside door
        g.setColor(new Color(225, 172, 166));
        g.fillRect(478, 342, 13, 43);

        g.setColor(new Color(255, 209, 64));
        g.fillRect(487, 342, 6, 43);

        g.setColor(new Color(191, 149, 18));
        g.drawRect(478, 342, 13, 43);

        //front side middle
        g.setColor(Color.white);
        g.fillRect(408, 327, 30, 65);

        g.setColor(new Color(128, 110, 126));
        g.fillRect(408, 392, 30, 30);

        g.setColor(Color.white);
        g.fillRect(211, 327, 30, 65);

        g.setColor(new Color(128, 110, 126));
        g.fillRect(211, 392, 30, 30);

        g.setColor(Color.BLACK);
        g.fillRect(251, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(259, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(267, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(275, 340, 7, 7);

        g.setColor(Color.BLACK);
        g.fillRect(290, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(298, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(306, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(314, 340, 7, 7);

        g.setColor(Color.BLACK);
        g.fillRect(329, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(337, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(345, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(353, 340, 7, 7);

        g.setColor(Color.BLACK);
        g.fillRect(368, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(376, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(384, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(392, 340, 7, 7);

        g.setColor(new Color(141, 147, 175));
        g.drawRect(248, 352, 32, 10);
        g.drawRect(288, 352, 32, 10);
        g.drawRect(328, 352, 32, 10);
        g.drawRect(368, 352, 32, 10);

        g.drawRect(248, 368, 32, 10);
        g.drawRect(288, 368, 32, 10);
        g.drawRect(328, 368, 32, 10);
        g.drawRect(368, 368, 32, 10);

        g.drawRect(248, 384, 32, 10);
        g.drawRect(288, 384, 32, 10);
        g.drawRect(328, 384, 32, 10);
        g.drawRect(368, 384, 32, 10);

        g.drawRect(248, 400, 32, 10);
        g.drawRect(288, 400, 32, 10);
        g.drawRect(328, 400, 32, 10);
        g.drawRect(368, 400, 32, 10);

        g.setColor(new Color(192, 202, 223));
        int a7[] = {240, 240, 410, 410, 405, 405, 245, 245};
        int b7[] = {422, 327, 327, 422, 422, 336, 336, 422};
        g.fillPolygon(a7, b7, 8);

        //front side left
        g.setColor(new Color(192, 202, 223));
        int a8[] = {110, 110, 214, 214, 209, 209, 115, 115};
        int b8[] = {422, 327, 327, 422, 422, 336, 336, 422};
        g.fillPolygon(a8, b8, 8);

        g.setColor(Color.BLACK);
        g.fillRect(125, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(133, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(141, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(149, 340, 7, 7);

        g.setColor(Color.BLACK);
        g.fillRect(165, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(173, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(181, 340, 7, 7);
        g.setColor(Color.BLACK);
        g.fillRect(189, 340, 7, 7);

        g.setColor(new Color(141, 147, 175));
        g.drawRect(125, 352, 32, 10);
        g.drawRect(162, 352, 32, 10);

        g.drawRect(125, 368, 32, 10);
        g.drawRect(162, 368, 32, 10);

        g.drawRect(125, 384, 32, 10);
        g.drawRect(162, 384, 32, 10);

        g.drawRect(125, 400, 32, 10);
        g.drawRect(162, 400, 32, 10);

        //front yard
        int m1[] = {102, 720, 720, 0};
        int n1[] = {423, 423, 480, 480};

        g.setColor(new Color(199, 182, 198));
        g.fillPolygon(m1, n1, 4);

        int m2[] = {440, 710, 710, 455};
        int n2[] = {423, 423, 453, 453};

        g.setColor(new Color(84, 126, 27));
        g.fillPolygon(m2, n2, 4);

        //boy
        g.setColor(Color.blue);
        int bm2[] = {360, 370, 410, 320};
        int bn2[] = {390, 390, 450, 450};
        g.fillPolygon(bm2, bn2, 4);
        //g.fillRect(310, 395, 80, 100);
        g.setColor(new Color(249, 159, 15));
        g.fillRect(358, 370, 15, 25);
        g.setColor(Color.black);
        g.fillOval(340, 350, 40, 40);
        g.setColor(Color.white);
        g.fillOval(350, 350, 35, 40);
        g.setColor(new Color(249, 159, 15));
        g.fillRect(380, 450, 10, 15);
        g.fillRect(345, 450, 10, 15);

        //tree
        g.setColor(new Color(164, 117, 36));
        int y[] = {610, 615, 620, 625};
        int z[] = {450, 300, 300, 450};
        g.fillPolygon(y, z, 4);

        g.setColor(new Color(129, 165, 29));

        g.fillArc(560, 300, 110, 80, 0, 360);
        g.fillArc(570, 270, 90, 100, 0, 360);
        g.fillArc(595, 240, 40, 90, 0, 360);

        //car 
        g.setColor(Color.blue);
        g.fillArc(75, 415, 140, 60, 0, 180);
        g.fillArc(105, 400, 80, 60, 0, 180);

        g.setColor(Color.white);
        g.fillArc(120, 404, 52, 37, 0, 90);
        g.fillArc(113, 404, 55, 36, 90, 90);
        g.fillArc(85, 427, 7, 7, 0, 360);
        g.fillArc(197, 427, 7, 7, 0, 360);

        g.setColor(Color.black);
        g.fillArc(100, 430, 20, 20, 0, 360);
        g.fillArc(160, 430, 20, 20, 0, 360);
        g.setColor(Color.white);
        g.fillArc(104, 434, 12, 12, 0, 360);
        g.fillArc(164, 434, 12, 12, 0, 360);

    }

    static int p = 255, q = 255, t = 0, mx = 1000, my = 600;

    public static void main(String[] args) throws InterruptedException {
        JFrame f = new JFrame();
        MiniprojectAnimation d = new MiniprojectAnimation();
        f.add(d);
        f.setSize(700, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        while (true) {
            if (p > 0) {
                d.moveCloud_Car();
                d.repaint();
                p--;
                q--;
                t++;
                mx--;
                my--;

                Thread.sleep(35);

            } else {
                d.moveCloud_Car();
                d.repaint();
                mx--;
                my--;

                Thread.sleep(35);
            }
        }
    }

}

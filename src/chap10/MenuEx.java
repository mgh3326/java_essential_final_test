/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap10;
import javax.swing.*;

public class MenuEx extends JFrame {
    MenuEx() {
        setTitle("Menu 만들기  예제");
        createMenu(); // 메뉴를 생성하여 프레임에 삽입
        setSize(250,200);
        setVisible(true);
    }

    // 메뉴를 만들어 프레임에 삽입한다.
    void createMenu() {
        JMenuBar mb = new JMenuBar(); // 메뉴바 생성
        JMenu screenMenu = new JMenu("Screen"); // Screen 메뉴 생성

        // Screen 메뉴에 메뉴아이템 생성 삽입
        screenMenu.add(new JMenuItem("Load"));
        screenMenu.add(new JMenuItem("Hide"));
        screenMenu.add(new JMenuItem("ReShow"));
        screenMenu.addSeparator(); // 분리선 삽입
        screenMenu.add(new JMenuItem("Exit"));

        // 메뉴바에 메뉴 삽입
        mb.add(screenMenu); // Screen 메뉴 삽입
        mb.add(new JMenu("Edit")); // Edit 메뉴 생성 삽입
        mb.add(new JMenu("Source")); // Source 메뉴 생성 삽입
        mb.add(new JMenu("Project")); // Project 메뉴 생성 삽입
        mb.add(new JMenu("Run")); // Run 메뉴 생성 삽입

        // 메뉴바를 프레임에 부착
        setJMenuBar(mb);//<<메뉴바를 프레임에 붙임. 비로소 메뉴가 보인다.
    }

    public static void main(String [] args) {
        new MenuEx();
    }
}

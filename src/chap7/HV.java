/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap7;//7장 보너스1
import java.util.*;
public class HV {
    public static Vector<String> hashToVector(HashMap<String,String> h){
        Vector<String> v= new Vector<String>(); //벡터 생성
        Set<String> s = h.keySet();// 키를 모두 Set 컬렉션에 받아옴
// 해시맵 h로부터 키의 Set 컬렉션 s 얻기
        Iterator<String> it=s.iterator();
        while(it.hasNext()){
            String key=it.next();
            v.add(h.get(key));//값을 벡터에 삽입
        }
        return v;
    }
    public static void main(String[] args){
        HashMap<String, String> h = new HashMap<String, String>();//해시맵 h 생성
        h.put("범죄","112");
        h.put("화재","119");
        h.put("전화번호","114");
        Vector<String> v= hashToVector(h);//hashToVecotr() 호출
        for(int n=0;n<v.size();n++)
            System.out.print(v.get(n)+" ");
    }
}

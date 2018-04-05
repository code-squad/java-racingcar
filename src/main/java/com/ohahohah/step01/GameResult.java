package com.ohahohah.step01;

import java.util.HashMap;
import java.util.Map;

public class GameResult {

  private Map<Integer, HashMap<Integer,Integer>> tryCoor;

  public void saveTryStatus(int tryNo, int carNo, int CarCoordinate){
    tryCoor.put(tryNo,new HashMap<Integer,Integer>(carNo,CarCoordinate));
  }

  public void saveTryStatus(int tryNo, Car player){
    tryCoor.put(tryNo,new HashMap<Integer,Integer>(player.getPlayerNum(),player.getCoords()));
  }

}

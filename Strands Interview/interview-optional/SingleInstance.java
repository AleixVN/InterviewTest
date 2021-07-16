package com.strands.spf;

/**
 * <p>
 * Single instance in a multi threading environment
 * </p>
 * 
 * @author strands
 * 
 */
public class SingleInstance {
  private SingleInstance instance;

  private SingleInstance() {
    // TODO Auto-generated constructor stub
  }

  public static SingleInstance getInstance() {
    if (instance == null)
      instance = new SingleInstance();

    return instance;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    SingleInstance myInstance = SingleInstance.getInstance();
    SingleInstance mySecondInstance = SingleInstance.getInstance();

    System.out.println(myInstance);
    System.out.println(mySecondInstance);
  }

}

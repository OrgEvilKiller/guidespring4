package com.ek.spring.demo14_transaction_configuration.exception;

/**
 * 这是一个自定义异常
 *
 */
public class BookStockException extends RuntimeException{

  private static final long serialVersionUID = 1L;

  public BookStockException() {
    super();
  }

  public BookStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public BookStockException(String message, Throwable cause) {
    super(message, cause);
  }

  public BookStockException(String message) {
    super(message);
  }

  public BookStockException(Throwable cause) {
    super(cause);
  }
  
}
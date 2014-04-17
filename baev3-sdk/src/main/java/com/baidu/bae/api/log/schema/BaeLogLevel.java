/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.baidu.bae.api.log.schema;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum BaeLogLevel implements org.apache.thrift.TEnum {
  FATAL(1),
  WARNING(2),
  NOTICE(4),
  TRACE(8),
  DEBUG(16);

  private final int value;

  private BaeLogLevel(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static BaeLogLevel findByValue(int value) { 
    switch (value) {
      case 1:
        return FATAL;
      case 2:
        return WARNING;
      case 4:
        return NOTICE;
      case 8:
        return TRACE;
      case 16:
        return DEBUG;
      default:
        return null;
    }
  }
}

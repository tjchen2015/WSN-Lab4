// $Id: BlinkToRadio.h,v 1.4 2006/12/12 18:22:52 vlahan Exp $

#ifndef BLINKTORADIO_H
#define BLINKTORADIO_H

enum {
  AM_BLINKTORADIOMSG = 6,
  TIMER_PERIOD_MILLI = 500,
  SET_POWER = 31
};

typedef nx_struct BlinkToRadioMsg {
  nx_uint16_t nodeid;
  nx_uint8_t power;
  nx_int8_t rssi;
  nx_uint8_t lqi;
} BlinkToRadioMsg;

#endif

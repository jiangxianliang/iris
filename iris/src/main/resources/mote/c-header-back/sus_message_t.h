/*
 * The header file is for the DBR experiment: CLM-SUS.
 * 
 * In this experiment:
 * 	1. Java program sends  INIT cmd to onboard node
 * 	2. Once onboard node receives the INIT cmd, it broadcasts to ground motes with PUSH msgs
 *  3. Once ground motes receiveds the PUSH msgs, they log the msgs with LQ into flash.
 *  4. Then the onboard mote sends multiple POLL msgs to each node one by one.
 *  5. Once the ground mote receives the POLL msgs, it sends back to onboard sensor RES msgs after all POLL msgs are stoped.
 *  6. Once the onboard mote receives all the RES msgs, it sends back to base station.
 * 
 * The header file defines all ths msg structs used in the experiment.  
 * 
 * 
 * TODO:
 * 	1. in the base station, the adds the LQ to the received msg
 * 
 * 
 */


/**
 * @author Songwei Fu
 */




enum {
  AM_SUS_MESSAGE_T = 20,
  UAV_ONBOARD_MOTE_ID = 100,
  MAX_POLL_ID = 5, // the onboard mote polling motes one by one until the MAX_POLL_ID
  BASE_STATION_ID = 1,
  
  //was 20
  PUSH_PERIOD = 20,
  POLL_PERIOD = 20,
  RESP_PERIOD = 20,
  INIT_PERIOD = 20,
  FWD_PERIOD = 20, // the period used for forwarding RESP msg to from Onboard Mote to BS
  
  
  
};

enum {
  INIT = 1,
  PUSH = 2, 
  POLL = 3,
  RESP =4,
  FORWARD = 5,
  PRETEST = 6,	
};


typedef nx_struct {
	nx_uint8_t experimentID;
	nx_uint8_t sourceID;
	nx_uint16_t destinationID;
	nx_uint8_t msgType;
}SUS_HEADER;

typedef nx_struct{
  nx_int16_t RSSI;
  nx_uint16_t LQI;
  nx_uint16_t CRC;
  nx_uint16_t noiseFlr;  

}LQ_METRICS;

typedef nx_struct{
	nx_uint32_t uavInPosTime;
	nx_uint8_t pushNumber;
	nx_uint8_t pollNumber;
	nx_uint16_t pollID;
	nx_uint8_t respNumber;
	nx_uint8_t txPowerUAV;
	nx_uint8_t txPowerGMote;
}INIT_MSG;

typedef nx_struct{
	nx_uint16_t pollID;	
	nx_uint8_t totalPollNumber;
	nx_uint8_t respNumber;
	nx_uint8_t txPowerGMote;
}POLL_MSG;

typedef nx_struct{
	nx_uint8_t seqNumberPush; 	
}PUSH_MSG;

typedef nx_struct{
	nx_uint8_t seqNumberResp;
	LQ_METRICS pushMsgLQ;
	LQ_METRICS respMsgLQ;
	nx_uint16_t temperature;
	nx_uint16_t humidity;	
}RESP_MSG;

typedef nx_struct{
	nx_uint32_t uavInPosTime;
	nx_uint8_t pushNumber;
	nx_uint8_t txPowerUAV;

}PRETEST_MSG;


//SUS radio message struct
typedef nx_struct sus_message_t{
	SUS_HEADER header;
	nx_union {
		PRETEST_MSG preTestMsg;
		INIT_MSG initMsg;
		POLL_MSG pollMsg;
		PUSH_MSG pushMsg;
		RESP_MSG respMsg;
	}body;
}sus_message_t;





typedef nx_struct {
	nx_uint8_t experimentID_log;
	nx_uint16_t seqNumberPush_log; 		
	LQ_METRICS pushMsgLQ_log;
 	nx_uint16_t temp_log;
 	nx_uint16_t humid_log; 
 }PUSH_MESSAGE_LOG;

//SUS ground node log message struct
typedef nx_struct logentry {
    nx_uint16_t len; 
    PUSH_MESSAGE_LOG logMsg;
} log_entry_t;



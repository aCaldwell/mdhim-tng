//Put a single key in the data store
#define MDHIM_PUT 1
//Put multiple keys in the data store at one time
#define MDHIM_BULK_PUT 2
//Get multiple keys from the data store at one time
#define MDHIM_BULK_GET 3
//Delete a single key from the data store
#define MDHIM_DEL 4
//Delete multiple keys from the data store at once
#define MDHIM_BULK_DEL 5
//Close message
#define MDHIM_CLOSE 6
//Generic receive message
#define MDHIM_RECV 7
//Receive message for a get request
#define MDHIM_RECV_GET 8
//Receive message for a bulk get request
#define MDHIM_RECV_BULK_GET 9
//Commit message
#define MDHIM_COMMIT 10

/* Operations for getting a key/value */
//Get the value for the specified key
#define MDHIM_GET_EQ     0
//Get the next key and value
#define MDHIM_GET_NEXT   1
//Get the previous key and value
#define MDHIM_GET_PREV   2
//Get the first key and value
#define MDHIM_GET_FIRST  3
//Get the last key and value
#define MDHIM_GET_LAST   4
/* Use these operation types for retrieving the primary key
   from a secondary index and key. */
//Gets the primary key's value from a secondary key
#define MDHIM_GET_PRIMARY_EQ 5

//Message Types
#define RANGESRV_WORK_MSG         1
#define RANGESRV_WORK_SIZE_MSG    2
#define RANGESRV_INFO             3
#define CLIENT_RESPONSE_MSG       4
#define CLIENT_RESPONSE_SIZE_MSG  5

#define MAX_BULK_OPS 1000000

//Maximum size of messages allowed
#define MDHIM_MAX_MSG_SIZE 2147483647

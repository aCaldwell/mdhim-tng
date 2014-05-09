#include "mdhim.h"
#include "data_store.h"

int mdhim_mysql_open(void **dbh, void **dbs, char *path, int flags,
		       struct mdhim_store_opts_t *mstore_opts);
int mdhim_mysql_put(void *dbh, void *key, int key_len, void *data, int32_t data_len, 
		      struct mdhim_store_opts_t *mstore_opts);
int mdhim_mysql_get(void *dbh, void *key, int key_len, void **data, int32_t *data_len, 
		      struct mdhim_store_opts_t *mstore_opts);
int mdhim_mysql_get_next(void *dbh, void **key, int *key_len, 
			   void **data, int32_t *data_len,
			   struct mdhim_store_opts_t *mstore_opts);
int mdhim_mysql_get_prev(void *dbh, void **key, int *key_len, 
			   void **data, int32_t *data_len,
			   struct mdhim_store_opts_t *mstore_opts);
int mdhim_mysql_close(void *dbh, void *dbs, struct mdhim_store_opts_t *mstore_opts);
int mdhim_mysql_del(void *dbh, void *key, int key_len, 
		      struct mdhim_store_opts_t *mstore_opts);
int mdhim_mysql_commit(void *dbh);
int mdhim_mysql_batch_put(void *dbh, void **key, int32_t *key_lens, 
			    void **data, int32_t *data_lens, int num_records,
			    struct mdhim_store_opts_t *mstore_opts);

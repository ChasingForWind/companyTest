select *
from sales_plan_detail_multi_version_info
WHERE (tenant_code = 'Alibaba' and biz_id = 2245000 and biz_mode = 99 and stat_date >= '2021-02-01 00:00:00.0' and stat_date <= '2021-12-31 00:00:00.0' and plan_date = '2021-08-20 00:00:00.0' and
       data_version = 'M-0' and entity_type in (1) and stat_date_dim_type = 3) limit 0,20;

Alibaba(String), 2245000(Long), 99(Integer), 2020-12-01 00:00:00.0(Timestamp), 2021-07-01 00:00:00.0(Timestamp), 2021-07-20 00:00:00.0(Timestamp), M-0(String), 1(Integer), 3(Integer), 0(Integer), 20(Integer)
Alibaba(String), 2245000(Long), 99(Integer), 2021-02-01 00:00:00.0(Timestamp), 2021-12-31 00:00:00.0(Timestamp), 2021-08-20 00:00:00.0(Timestamp), M-0(String), 1(Integer), 3(Integer), 0(Integer), 20(Integer)
Alibaba(String), 2245000(Long), 99(Integer), 2021-02-01 00:00:00.0(Timestamp), 2021-12-31 00:00:00.0(Timestamp), 2021-08-20 00:00:00.0(Timestamp), M-0(String), 1(Integer), 3(Integer), 0(Integer), 20(Integer)
Alibaba(String), 2245000(Long), 99(Integer), 2021-08-01 00:00:00.0(Timestamp), 2021-02-01 00:00:00.0(Timestamp), 2021-08-20 00:00:00.0(Timestamp), M-0(String), 1(Integer), 3(Integer)
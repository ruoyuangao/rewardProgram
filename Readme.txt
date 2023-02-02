Database Design

records:

record_id(pk), customer)id(fk), money_spend, record_created, points_received


customers:

customer_id, customer_name


API Design:

POST: /records
{
    record:{}
    record:{}
    ...
}

GET: /rewards/{id}

{
    "customer_id": "1",
    "customer_name": "John",
    "monthly_reward": {},
    "three_month_ttl_reward":
}
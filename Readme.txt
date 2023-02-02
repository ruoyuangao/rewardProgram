Database Design

records:

record_id(pk), customer)id(fk), money_spend, record_created, points_received


customers:

customer_id, customer_name


API Design:

1. create records
POST: /records
{
    record:{}
    record:{}
    ...
}

2. create customers
POST: /customers

3. get rewards
GET: /rewards/{id}

{
    "customer_id": "1",
    "customer_name": "John",
    "monthly_reward": {},
    "three_month_ttl_reward":
}
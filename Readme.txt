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
    {
        customer_id:
        month:
        ttl_points:
    }
    {
            customer_id:
            month:
            ttl_points:
        }
    }
    {
            customer_id:
            month:
            ttl_points:
        }
    }
    threemonth_ttl_reward:;
}
select o.product_name
from ORDERS o inner join CUSTOMERS c on c.id = o.customer_id
where name ilike :name;
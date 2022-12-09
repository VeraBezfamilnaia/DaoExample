create table CUSTOMERS
(
    id           serial primary key,
    name         text    not null,
    surname      text    not null,
    age          integer not null,
    phone_number text not null
);

create table ORDERS
(
    id           serial primary key,
    date         date    not null,
    customer_id  integer not null,
    product_name text    not null,
    amount       integer not null,
    foreign key (customer_id) references CUSTOMERS (id)
);

create index customer_id_index
    on orders(customer_id);
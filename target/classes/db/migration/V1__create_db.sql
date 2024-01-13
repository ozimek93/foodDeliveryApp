CREATE TABLE restaurant
(
    restaurant_id SERIAL NOT NULL,
    name VARCHAR(100) NOT NULL,
    street VARCHAR(50) NOT NULL,
    city VARCHAR (50) NOT NULL,
    phone VARCHAR (32) NOT NULL,
    email VARCHAR (50) NOT NULL,

    PRIMARY KEY (restaurant_id),
    UNIQUE (name)
);

CREATE TABLE dish
(
    dish_id SERIAL NOT NULL,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(100) NOT NULL,
    description VARCHAR(200),
    restaurant_id INTEGER NOT NULL,
    price FLOAT NOT NULL,

    PRIMARY KEY (dish_id),
    CONSTRAINT fk_dish_restaurant
        FOREIGN KEY (restaurant_id)
            REFERENCES restaurant (restaurant_id)
);

CREATE TABLE accepted_addresses
(
    id SERIAL NOT NULL,
    street VARCHAR(50) NOT NULL,
    restaurant_id INTEGER NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_accepted_addresses_restaurant
        FOREIGN KEY (restaurant_id)
            REFERENCES restaurant (restaurant_id)
);

CREATE TABLE customer
(
    customer_id SERIAL NOT NULL,
    name VARCHAR(50),
    city VARCHAR(100),
    street VARCHAR(100),
    phone VARCHAR(12),
    email VARCHAR(50),

    PRIMARY KEY (customer_id)
);

CREATE TABLE orders
(
    order_id SERIAL NOT NULL,
    customer_id INTEGER NOT NULL,
    restaurant_id INTEGER NOT NULL,
    dish_id INTEGER NOT NULL,
    create_date TIMESTAMP NOT NULL,
    order_ended BOOLEAN NOT NULL,
    price FLOAT NOT NULL,

    PRIMARY KEY (order_id),
    CONSTRAINT fk_order_customer
        FOREIGN KEY (customer_id)
            REFERENCES customer (customer_id),
    CONSTRAINT fk_order_restaurant
        FOREIGN KEY (restaurant_id)
            REFERENCES restaurant (restaurant_id),
    CONSTRAINT fk_order_dish
        FOREIGN KEY (dish_id)
            REFERENCES dish (dish_id)
);
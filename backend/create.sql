create table public.tb_sales (id  bigserial not null, amount float8, date timestamp, deals int4, visited int4, seller_id int8 not null, primary key (id));
create table public.tb_sellers (id  bigserial not null, name varchar(255), primary key (id));
alter table if exists public.tb_sales add constraint FKp0nn0oixeiw2fq3jivj6vnsu foreign key (seller_id) references public.tb_sellers;

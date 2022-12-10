insert into employee (id, birthdate, email, firstname, identifier, lastname, role)
values (
        nextVal('hibernate_sequence'),
        current_date,
        'abc1238@gmail.com',
        'Hüseyin',
        '12134',
        'huso',
        'ROLE_ADMIN'
        );

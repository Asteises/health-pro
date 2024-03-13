INSERT INTO ingredients (id, name, category, amount, cooking_time, recipe_id)
VALUES ('071045de-afa3-4c40-ad8c-83eed24ddad2', 'свекла', 'овощи', '2 штуки', '2024-01-01 00:00:30', 'e2d6ee6c-d581-42c1-88e2-a28cc34f8fc0');
INSERT INTO ingredients (id, name, category, amount, cooking_time, recipe_id)
VALUES ('2ce0cc9f-9384-4375-b268-7e40e5ae549f', 'грецкий орех', 'орехи', '50 гр', '2024-01-01 00:00:30', 'e2d6ee6c-d581-42c1-88e2-a28cc34f8fc0');
INSERT INTO ingredients (id, name, category, amount, cooking_time, recipe_id)
VALUES ('29470da8-5fc3-49b0-b405-280da4b6b751', 'чеснок', 'овощи', '1 зубчик', '2024-01-01 00:00:30', 'e2d6ee6c-d581-42c1-88e2-a28cc34f8fc0');
INSERT INTO ingredients (id, name, category, amount, cooking_time, recipe_id)
VALUES ('513eb3db-6806-434e-bf58-2fa036d1c555', 'майонез', 'соусы', '1.5 столовые ложки', '2024-01-01 00:00:30', 'e2d6ee6c-d581-42c1-88e2-a28cc34f8fc0');
INSERT INTO ingredients (id, name, category, amount, cooking_time, recipe_id)
VALUES ('f4cd0253-020d-4888-ace3-3362241c490e', 'соль', 'приправы', 'по вкусу', '2024-01-01 00:00:30', 'e2d6ee6c-d581-42c1-88e2-a28cc34f8fc0');
INSERT INTO ingredients (id, name, category, amount, cooking_time, recipe_id)
VALUES ('0f538fde-88e0-449e-aed1-a1a508d6a5d8', 'черный перец (молотый)', 'приправы', '1 щепотка', '2024-01-01 00:00:30', 'e2d6ee6c-d581-42c1-88e2-a28cc34f8fc0');

INSERT INTO recipes (id, name, category, cooking_time)
VALUES ('e2d6ee6c-d581-42c1-88e2-a28cc34f8fc0', 'Свекольный салат с чесноком и грецким орехом', 'салаты',
        '2024-01-01 00:00:30');

INSERT INTO steps (id, title, description, cooking_time, photo_url, recipe_id)
VALUES ('0150551a-e501-466b-9d10-eba899720db4',
        'Шаг 1',
        'Свеклу можно приготовить заранее. Можно запечь ее в духовке 20 минут, завернув в фольгу. А можно просто отварить свеклу в кипящей воде в кастрюле до готовности, минут 20-25.',
        '2024-01-01 00:00:30',
        'src/main/resources/img/recipe-1-1.jpg',
        'e2d6ee6c-d581-42c1-88e2-a28cc34f8fc0');

INSERT INTO recipes_ingredients (recipe_id, ingredient_id) VALUES ('e2d6ee6c-d581-42c1-88e2-a28cc34f8fc0', '071045de-afa3-4c40-ad8c-83eed24ddad2');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id) VALUES ('e2d6ee6c-d581-42c1-88e2-a28cc34f8fc0', '2ce0cc9f-9384-4375-b268-7e40e5ae549f');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id) VALUES ('e2d6ee6c-d581-42c1-88e2-a28cc34f8fc0', '29470da8-5fc3-49b0-b405-280da4b6b751');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id) VALUES ('e2d6ee6c-d581-42c1-88e2-a28cc34f8fc0', '513eb3db-6806-434e-bf58-2fa036d1c555');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id) VALUES ('e2d6ee6c-d581-42c1-88e2-a28cc34f8fc0', 'f4cd0253-020d-4888-ace3-3362241c490e');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id) VALUES ('e2d6ee6c-d581-42c1-88e2-a28cc34f8fc0', '0f538fde-88e0-449e-aed1-a1a508d6a5d8');
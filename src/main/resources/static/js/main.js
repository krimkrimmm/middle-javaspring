const products = [
    {
        "id": 1,
        "name": "iPhone",
        "description": "Flagship smartphone with A17 Bionic chip and ProMotion display.",
        "thumbnail": "https://example.com/images/iphone.jpg",
        "price": 1999999.9,
        "rating": 4.9
    },
    {
        "id": 2,
        "name": "Samsung Galaxy",
        "description": "Premium Android phone with Dynamic AMOLED 2X display.",
        "thumbnail": "https://example.com/images/samsung-galaxy.jpg",
        "price": 1799999.5,
        "rating": 4.7
    },
    {
        "id": 3,
        "name": "Google Pixel",
        "description": "Pure Android experience with excellent AI-powered camera.",
        "thumbnail": "https://example.com/images/google-pixel.jpg",
        "price": 1499999.0,
        "rating": 4.6
      },
      {
        "id": 4,
        "name": "OnePlus",
        "description": "High-performance phone with fast charging and 120Hz display.",
        "thumbnail": "https://example.com/images/oneplus.jpg",
        "price": 1299999.9,
        "rating": 4.5
      },
      {
        "id": 5,
        "name": "Xiaomi",
        "description": "Affordable smartphone with powerful specs and long battery life.",
        "thumbnail": "https://example.com/images/xiaomi.jpg",
        "price": 999999.9,
        "rating": 4.3
      },
      {
        "id": 6,
        "name": "Oppo",
        "description": "Stylish phone with innovative camera features.",
        "thumbnail": "https://example.com/images/oppo.jpg",
        "price": 899999.5,
        "rating": 4.2
      },
      {
        "id": 7,
        "name": "Vivo",
        "description": "Selfie-focused smartphone with AI-enhanced photography.",
        "thumbnail": "https://example.com/images/vivo.jpg",
        "price": 850000.0,
        "rating": 4.1
      },
      {
        "id": 8,
        "name": "Realme",
        "description": "Gaming smartphone with high refresh rate and big battery.",
        "thumbnail": "https://example.com/images/realme.jpg",
        "price": 799999.9,
        "rating": 4.0
      },
      {
        "id": 9,
        "name": "Nokia",
        "description": "Durable phone with stock Android and excellent battery life.",
        "thumbnail": "https://example.com/images/nokia.jpg",
        "price": 749999.9,
        "rating": 3.9
      },
      {
        "id": 10,
        "name": "Sony Xperia",
        "description": "Premium phone with top-tier camera and 4K OLED display.",
        "thumbnail": "https://example.com/images/sony-xperia.jpg",
        "price": 1999999.5,
        "rating": 4.8
      },
      {
          "id": 11,
          "name": "Apple",
          "description": "Malignant neoplasm of thyroid gland",
          "thumbnail": "https://example.com/image31.jpg",
          "price": 1899999.9,
          "rating": 4.9
        },
        {
          "id": 12,
          "name": "Sony",
          "description": "Benign neoplasm of kidney",
          "thumbnail": "https://example.com/image32.jpg",
          "price": 1654321.5,
          "rating": 4.3
        },
        {
          "id": 13,
          "name": "HTC",
          "description": "Closed fracture of base of skull without intracranial injury",
          "thumbnail": "https://example.com/image33.jpg",
          "price": 1187654.0,
          "rating": 3.6
        },
        {
          "id": 14,
          "name": "OnePlus",
          "description": "Nontraumatic rupture of tendon of biceps",
          "thumbnail": "https://example.com/image34.jpg",
          "price": 1345897.8,
          "rating": 4.1
        },
        {
          "id": 15,
          "name": "Huawei",
          "description": "Other specified disorders of kidney and ureter",
          "thumbnail": "https://example.com/image35.jpg",
          "price": 1478956.2,
          "rating": 3.8
        },
        {
          "id": 16,
          "name": "Xiaomi",
          "description": "Unspecified disorder of male genital organs",
          "thumbnail": "https://example.com/image36.jpg",
          "price": 1256789.3,
          "rating": 4.0
        },
        {
          "id": 17,
          "name": "Vivo",
          "description": "Other specified infections due to Chlamydiae",
          "thumbnail": "https://example.com/image37.jpg",
          "price": 1436785.5,
          "rating": 3.7
        },
        {
          "id": 18,
          "name": "Meizu",
          "description": "Other congenital malformations of the great veins",
          "thumbnail": "https://example.com/image38.jpg",
          "price": 1123456.8,
          "rating": 3.2
        },
        {
          "id": 19,
          "name": "TCL",
          "description": "Toxic effect of venom of other arthropods",
          "thumbnail": "https://example.com/image39.jpg",
          "price": 1298765.4,
          "rating": 3.9
        },
        {
          "id": 20,
          "name": "Google",
          "description": "Chronic pain syndrome",
          "thumbnail": "https://example.com/image40.jpg",
          "price": 1547890.6,
          "rating": 4.5
        },
        {
          "id": 21,
          "name": "Sharp",
          "description": "Other specified diseases of the liver",
          "thumbnail": "https://example.com/image41.jpg",
          "price": 1399876.3,
          "rating": 3.4
        },
        {
          "id": 22,
          "name": "Panasonic",
          "description": "Personal history of malignant neoplasm of liver",
          "thumbnail": "https://example.com/image42.jpg",
          "price": 1587654.9,
          "rating": 4.2
        },
        {
          "id": 23,
          "name": "Hisense",
          "description": "Poisoning by antidepressants",
          "thumbnail": "https://example.com/image43.jpg",
          "price": 1176543.2,
          "rating": 3.3
        },
        {
          "id": 24,
          "name": "Coolpad",
          "description": "Cystic fibrosis with pulmonary manifestations",
          "thumbnail": "https://example.com/image44.jpg",
          "price": 1098765.8,
          "rating": 2.8
        },
        {
          "id": 25,
          "name": "Micromax",
          "description": "Parasitic pneumonia",
          "thumbnail": "https://example.com/image45.jpg",
          "price": 1234567.7,
          "rating": 3.5
        },
        {
          "id": 26,
          "name": "Asus",
          "description": "Personal history of diseases of the respiratory system",
          "thumbnail": "https://example.com/image46.jpg",
          "price": 1567890.2,
          "rating": 4.0
        },
        {
          "id": 27,
          "name": "Infinix",
          "description": "Other chronic osteomyelitis",
          "thumbnail": "https://example.com/image47.jpg",
          "price": 1287654.6,
          "rating": 3.6
        },
        {
          "id": 28,
          "name": "Tecno",
          "description": "Poisoning by systemic antibiotics",
          "thumbnail": "https://example.com/image48.jpg",
          "price": 1423456.1,
          "rating": 4.3
        },
        {
          "id": 29,
          "name": "LeEco",
          "description": "Other and unspecified effects of external causes",
          "thumbnail": "https://example.com/image49.jpg",
          "price": 1354321.5,
          "rating": 3.7
        },
        {
          "id": 30,
          "name": "Ulefone",
          "description": "Certain early complications of trauma",
          "thumbnail": "https://example.com/image50.jpg",
          "price": 1198765.4,
          "rating": 3.9
        }
      ]
];

const productList = document.querySelector('.products');

products.forEach(product => {
    const productItem = document.createElement('li');
    productItem.classList.add('product-detail');

    productItem.innerHTML = `
        <img src="${product.thumbnail}" alt="${product.name}">
        <div class="product-name">${product.name}</div>
        <div class="product-description">${product.description}</div>
        <div class="product-price">${product.price.toLocaleString()}₫</div>
        <div class="product-rating">⭐ ${product.rating}</div>
    `;

    productList.appendChild(productItem);
});

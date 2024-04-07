document.addEventListener("DOMContentLoaded", function() {
  const menuItemSelectElement = document.getElementById("selectMenuIetm");
  const sizeSelectElement = document.getElementById("selectSize");
  const resultParagraph = document.getElementById("total");

  // Function to handle dropdown change event
  function handleDropdownChange() {
      const menuItemId = menuItemSelectElement.value;
      const sizeId = sizeSelectElement.value;

      // Make a POST request to the Spring Boot controller action
      fetch('/calculate_total', {
          method: 'POST',
          headers: {
              'Content-Type': 'application/json'
          },
          body: JSON.stringify({ menuItemId: menuItemId, sizeId: sizeId })
      })
      .then(response => response.json())
      .then(data => {
          // Update the <p> tag with the response data
          resultParagraph.textContent = data.total;
      })
      .catch(error => {
          console.error('Error:', error);
          resultParagraph.textContent = 'An error occurred. Please try again.';
      });
  }

  // Add event listeners to both dropdowns
  menuItemSelectElement.addEventListener("change", handleDropdownChange);
  sizeSelectElement.addEventListener("change", handleDropdownChange);
});
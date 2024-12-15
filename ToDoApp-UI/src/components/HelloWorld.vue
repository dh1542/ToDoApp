<template>
  <div id="header">
    <h1>ToDo-App</h1>
  </div>
  <div id="content">
    <v-card class="mx-auto" prepend-icon="$vuetify" width="400" id="card">
      <template v-slot:title>
        <span class="font-weight-black">Create Categories + Task</span>
      </template>

      <v-card-text class="bg-surface-light pt-4">
        Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi,
        ratione debitis quis est labore voluptatibus! Eaque cupiditate minima,
        at placeat totam, magni doloremque veniam neque porro libero rerum unde
        voluptatem! CONTENT
      </v-card-text>
    </v-card>
    <v-card
      class="mx-auto"
      prepend-icon="$vuetify"
      subtitle="The #1 Vue UI Library"
      width="400"
      id="card"
    >
      <template v-slot:title>
        <span class="font-weight-black">Task List</span>
      </template>

      <v-card-text class="bg-surface-light pt-4">
        Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi,
        ratione debitis quis est labore voluptatibus! Eaque cupiditate minima,
        at placeat totam, magni doloremque veniam neque porro libero rerum unde
        voluptatem! CONTENT
      </v-card-text>
    </v-card>
  </div>
</template>

<script setup lang="ts">
//
</script>

<style>
#header {
  color: white;
  position: absolute;
  left: 50%;
  transform: translateX(-50%);
  padding: 1rem;
}

#content {
  position: absolute;
  margin-top: 5rem;
  height: 100%;
  width: 100%;
  display: flex;
  flex-direction: row;
}

#card {
  margin-top: 5rem;
  height: 30%;
  width: 40%;
  margin-left: 0;
  border-radius: 10px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}
</style>
